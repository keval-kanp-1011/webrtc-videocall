package dev.kevalkanpariya.webrtcvideocalll.event

import androidx.annotation.StringRes
import dev.kevalkanpariya.webrtcvideocalll.R.string

sealed class UiText {
    data class DynamicString(val value: String): UiText()
    data class StringResource(@StringRes val id: Int): UiText()

    companion object {
        fun unknownError(): UiText {
            return UiText.StringResource(string.error_unknown)
        }
    }
}