import org.junit.Assert.*
import org.junit.Test

class PersonTest {

    @Test
    fun name() {
        val person = Person("Andy", "Witrisna", 25)
        person.age
        person.firstname
        person.lastname
        val person2 = person.copy(firstname = "Andy2")
    }
}