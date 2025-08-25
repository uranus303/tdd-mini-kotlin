package com.example
data class Book(val isbn: String, val title: String, val author: String)
class BookInventory {
    fun add(book: Book) { /* TODO */ }
    fun count(): Int = 0
}
