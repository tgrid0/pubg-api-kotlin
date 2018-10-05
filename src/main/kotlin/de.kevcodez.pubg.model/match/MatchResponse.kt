package de.kevcodez.pubg.model.match

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import de.kevcodez.pubg.model.Link
import de.kevcodez.pubg.model.Relationships
import java.time.Instant

@JsonIgnoreProperties(ignoreUnknown = true)
enum class SeasonStates(val state: String) {
    CLOSED("closed"),
    PREPARE("prepare"),
    PROGRESS("progress")
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class MatchResponse(
    val data: MatchData,
    val included: List<MatchObject>,
    val links: Link,
    val meta: Any
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class MatchData(
    val type: String,
    val id: String,
    val attributes: MatchAttributes,
    val links: Link,
    val relationships: Relationships
)

@JsonIgnoreProperties("stats", "tags", ignoreUnknown = true)
data class MatchAttributes(
    val createdAt: Instant,
    val duration: Int,
    val gameMode: String,
    val mapName: String,
    val shardId: String,
    val titleId: String,
    val isCustomMatch: Boolean = false,
    val SeasonState: String?
)
