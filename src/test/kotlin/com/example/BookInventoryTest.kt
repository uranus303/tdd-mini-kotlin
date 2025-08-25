package com.example
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BookInventoryTest {
    @Test
    fun `adding a book increases count`() {
        val inv = BookInventory()
        inv.add(Book("123","Clean Code","Robert C. Martin"))
        assertEquals(1, inv.count())
    }
}
