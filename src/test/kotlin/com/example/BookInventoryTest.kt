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

@Test
fun `remove by isbn`() {
    val inv = BookInventory()
    inv.add(Book("111","A","X")); inv.add(Book("222","B","Y"))
    val removed = inv.removeByIsbn("111")
    org.junit.jupiter.api.Assertions.assertTrue(removed)
    org.junit.jupiter.api.Assertions.assertEquals(1, inv.count())
}
@Test
fun `find by author case-insensitive`() {
    val inv = BookInventory()
    inv.add(Book("1","A","Alice"))
    inv.add(Book("2","B","Bob"))
    inv.add(Book("3","C","alice"))
    val byAlice = inv.findByAuthor("ALICE")
    org.junit.jupiter.api.Assertions.assertEquals(listOf("A","C"), byAlice.map { it.title })
}

}
