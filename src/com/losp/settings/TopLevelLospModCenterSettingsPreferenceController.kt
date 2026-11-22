/*
 * SPDX-FileCopyrightText: LOSP Android Project
 * SPDX-License-Identifier: GPL-3.0
 */

package com.losp.settings

import android.content.Context
import com.android.settings.core.BasePreferenceController

class TopLevelLospModCenterSettingsPreferenceController(
    context: Context,
    preferenceKey: String
) : BasePreferenceController(context, preferenceKey) {

    override fun getAvailabilityStatus(): Int = AVAILABLE
}
