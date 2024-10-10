/*
 * SPDX-FileCopyrightText: 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.twelve.models

/**
 * Player playback status.
 */
enum class PlaybackState {
    IDLE,
    BUFFERING,
    READY,
    ENDED,
}
