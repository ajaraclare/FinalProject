package com.r.bottomnavigation.feature.EveningRoutineScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun CartScreen(
) {
    Box() {
        Text(text = "Evening Routine")
    }

    var routine by remember { mutableStateOf(TextFieldValue(text = "")) }


    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))


    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))


    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))


    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))


    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))

    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))

    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))

    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))


    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))


    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))


    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))

    Card {
        Row {

            TextField(value = routine,
                label = { Text(text = "routine") },
                onValueChange = {
                    routine = it
                })

            Spacer(modifier = Modifier.width(20.dp))

            val isChecked = remember { mutableStateOf(true) }
            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }
            )
        }
    }

}