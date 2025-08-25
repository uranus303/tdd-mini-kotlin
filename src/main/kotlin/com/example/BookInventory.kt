package com.example
data class Book(val isbn: String, val title: String, val author: String)
class BookInventory {
    private val byIsbn = linkedMapOf<String, Book>()
    fun add(book: Book) { byIsbn[book.isbn] = book }
    fun count(): Int = byIsbn.size

}
