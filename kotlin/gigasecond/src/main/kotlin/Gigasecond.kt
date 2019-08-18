import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime

const val GIGA: Long = 1000000000

class Gigasecond(datetime: LocalDateTime) {
    val date: LocalDateTime = datetime + Duration.ofSeconds(GIGA)
    constructor(date: LocalDate) : this(date.atStartOfDay()) {}
}