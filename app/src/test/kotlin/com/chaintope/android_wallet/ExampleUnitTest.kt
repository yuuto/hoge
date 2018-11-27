package com.chaintope.android_wallet

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
    fun rationalTest () {
        val i = gcd(16, 24)
        assertEquals(8, i)

    }

    tailrec private fun gcd(a: Int, b:Int): Int =
            if (b == 0) a
            else gcd(b, a%b)

    // lambda
    val square1: (Int) -> Int = { i:Int ->
        i*i
    }

    // anonymous
    val square2: (Int) -> Int = fun(i: Int): Int {
        return i*i
    }
    // anonymous to omit
    val square3: (Int) -> Int = fun(i: Int) = i*i

    open class Person(val name: String) {
        open fun introduceMyself() {
            println("I am $name.")
        }
    }

    class Student(name: String, val id: Long): Person(name) {
        override fun introduceMyself() {
            println("I am $name(id=$id)")
        }
    }

    @Test
    fun studentTest() {
        val student: Student = Student("くみこ", 123)
        student.introduceMyself()
        val person: Person = Student("くみこ", 234)
        person.introduceMyself()
        //person.id プロパティがないからはコンパイルエラー
    }

    class Container<T>(var value: T) {
    fun <T> box(value: T): Container<T> =
            Container(value)
    val <T> T.string: String
        get() = toString()
    fun hoge() {
        val a: Container<String> = Container("Hello")
        val b: Container<out Any> = a
//        b.value = 123
    }
}


}
