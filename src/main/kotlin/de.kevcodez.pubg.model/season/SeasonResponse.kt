package de.kevcodez.pubg.model.season

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties("links", "meta")
data class SeasonResponse(
    @JsonProperty("data")
    val seasons: List<Season>
)