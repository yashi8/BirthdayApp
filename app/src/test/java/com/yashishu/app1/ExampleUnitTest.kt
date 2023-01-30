package com.yashishu.app1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun email_isCorrect() {
        val utils = Utils()
        assertTrue(utils.checkEmail("raju@gmail.com"))
        assertTrue(utils.checkEmail("Raju#gmail.com"))
    }
}