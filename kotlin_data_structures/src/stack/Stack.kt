package stack

import java.util.*

interface stack<Element> {
    fun push(item: Element)
    fun pop(): Element?
    fun peek(): Element?

    fun size(): Int
    fun isEmpty(): Boolean
//    val isEmpty()
}

class StackImpl<T : Any>() : stack<T> {
    private val storage = arrayListOf<T>()

    override fun toString() = buildString {
        appendLine("----top----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("-----------")
    }

    override fun push(item: T) {
        storage.add(item)
    }

    override fun pop(): T {
        if (storage.size == 0)
//            return null
            throw EmptyStackException()

        return storage.removeAt(storage.size - 1)
    }

    override fun peek(): T? {
//        if (storage.isEmpty()) throw EmptyStackException()
//        return storage.last()
        return storage.lastOrNull()
    }

    override fun size() = storage.size

    override fun isEmpty(): Boolean {
        return storage.isEmpty()
    }
}