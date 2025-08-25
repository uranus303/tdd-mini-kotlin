package com.example
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class BookInventoryTest {
    @Test
    fun `adding a book increases count`() {
        val inv = BookInventory()
        inv.add(Book("123","Clean Code","Robert C. Martin"))
        assertEquals(1, inv.count())
    }
    @Test
    fun `isbn must be unique`() {
        val inv = BookInventory()
        inv.add(Book("123","A","X"))
        val ex = assertThrows<IllegalArgumentException> {
            inv.add(Book("123","B","Y"))
        }
        assertTrue(ex.message!!.contains("ISBN already exists"))
    }

}
