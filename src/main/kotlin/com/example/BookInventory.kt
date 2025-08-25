package com.example
data class Book(val isbn: String, val title: String, val author: String)
class BookInventory {
    private val byIsbn = linkedMapOf<String, Book>()
    fun count(): Int = byIsbn.size

    fun add(book: Book) {
    	if (byIsbn.containsKey(book.isbn)) {
        	throw IllegalArgumentException("ISBN already exists: ${book.isbn}")
    	}
    	byIsbn[book.isbn] = book
}
}
