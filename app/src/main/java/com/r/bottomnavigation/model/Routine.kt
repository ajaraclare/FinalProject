package com.commandiron.vacationchecklist.domain.model

import com.r.bottomnavigation.R

data class Routine(
    val id: Int,
    val name: String,
    val iconDrawable: Int,
)

val routines = listOf(
    Routine(
        id = 0,
        name = "Morning Routine",
        iconDrawable = R.drawable.morning
    ),
    Routine(
        id = 1,
        name = "Evening Routine",
        iconDrawable = R.drawable.dusk
    ),
    Routine(
        id = 1,
        name = "Study Routine",
        iconDrawable = R.drawable.studytime
    ),
    Routine(
        id = 1,
        name = "Work Routine",
        iconDrawable = R.drawable.worktime
    ),
    Routine(
        id = 1,
        name = "Hobbies Routine",
        iconDrawable = R.drawable.hobby
    )


)
