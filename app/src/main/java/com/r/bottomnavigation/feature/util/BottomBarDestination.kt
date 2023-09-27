package com.r.bottomnavigation.feature.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.r.bottomnavigation.R
import com.r.bottomnavigation.feature.destinations.CartScreenDestination
import com.r.bottomnavigation.feature.destinations.FavoriteScreenDestination
import com.r.bottomnavigation.feature.destinations.HobbiesScreenDestination
import com.r.bottomnavigation.feature.destinations.HomeScreenDestination
import com.r.bottomnavigation.feature.destinations.ProfileScreenDestination
import com.r.bottomnavigation.feature.destinations.StudyScreenDestination
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec

enum class BottomBarDestination(
    val direction: DirectionDestinationSpec,
    val icon: Int,
    val label: String
) {

    Home(HomeScreenDestination, R.drawable.home, "Home"),
    Profile(ProfileScreenDestination, R.drawable.sun,"Morning Routine"),
    Favorite(FavoriteScreenDestination, R.drawable.money, "Work Routine"),
    Study(StudyScreenDestination, R.drawable.science, "Study Routine"),
    Cart(CartScreenDestination, R.drawable.night, "Evening Routine"),
    Hobbies(HobbiesScreenDestination, R.drawable.menu, "Hobbies Routine")









}