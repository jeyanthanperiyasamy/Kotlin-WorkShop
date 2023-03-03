import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.Test

class PersonWithSerializationTest {

    @Test
    fun encodeToString() {
        val person = PersonWithSerialization("andy", "witrisna", 25)
        val str = Json.encodeToString(person)
        println(str)
        val personObj = Json.decodeFromString<PersonWithSerialization>(str)
        println(personObj)
    }
}