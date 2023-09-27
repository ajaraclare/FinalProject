package com.r.bottomnavigation.feature.CompleteRoutine

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.r.bottomnavigation.feature.EveningRoutineScreen.CartScreen
import com.r.bottomnavigation.feature.Hobbies.HobbiesScreen
import com.r.bottomnavigation.feature.MorningRoutineScreen.ProfileScreen
import com.r.bottomnavigation.feature.StudyRoutineScreen.StudyScreen
import com.r.bottomnavigation.feature.WorkRoutineScreen.FavoriteScreen
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun CompleteRoutineScreen() {

    LazyColumn(){
        item {

            Column(){
                ProfileScreen()
            }

            Column(){
                CartScreen()
            }

            Column(){
                StudyScreen()
            }

            Column(){
                FavoriteScreen()
            }

            Column(){
                HobbiesScreen()

            }


        }



    }


}