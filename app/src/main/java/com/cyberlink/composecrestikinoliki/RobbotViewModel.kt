package com.cyberlink.composecrestikinoliki

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class RobbotViewModel : ViewModel() {

    val state = mutableStateOf(OurState())


    fun click(index: Int) {

        val copy = state.value.copy()

        if (copy.field[index] == "" && copy.resultText.isEmpty()) {

            if (copy.flag == 0) {
                copy.field[index] = "x"

            }

        }





        copy.worker = copy.worker + 1
        state.value = copy

        cheker()
        notWin()
        if (state.value.resultText.isEmpty()) {

            RobbotStep()

        }

    }

    fun SmartRobbot(): Boolean {

        val copy = state.value.copy()

        if (copy.field[0] == "0" && copy.field[1] == "0" && copy.field[2].isEmpty()) {

            copy.field[2] = "0"
            return true

        }

        if (copy.field[3] == "0" && copy.field[4] == "0" && copy.field[2].isEmpty()) {

            copy.field[5] = "0"
            return true

        }

        if (copy.field[6] == "0" && copy.field[7] == "0" && copy.field[2].isEmpty()) {

            copy.field[8] = "0"
            return true

        }

        if (copy.field[0] == "0" && copy.field[3] == "0" && copy.field[2].isEmpty()) {

            copy.field[6] = "0"
            return true

        }

        if (copy.field[1] == "0" && copy.field[4] == "0" && copy.field[2].isEmpty()) {

            copy.field[7] = "0"
            return true

        }

        if (copy.field[2] == "0" && copy.field[5] == "0" && copy.field[2].isEmpty()) {

            copy.field[8] = "0"
            return true

        }
        return false

//        cheker()
//        notWin()

    }

    fun RobbotStep() {

        val copy = state.value.copy()

        copy.flag = 0

        val smartAnswer = SmartRobbot()

        if (smartAnswer == false) {

            while (true) {

                val randomchik = (0..8).random()
                if (copy.field[randomchik] == "") {

                    copy.field[randomchik] = "0"
                    break

                }

            }

        }


        cheker()
        notWin()
//        SmartRobbot()


    }


    fun cheker() {


        var copy = state.value.copy()

        if (copy.field[0] == "x"
            && copy.field[1] == "x"
            && copy.field[2] == "x"
        ) {

            copy.resultText = "X WIN"


        }

        if (copy.field[3] == "x"
            && copy.field[4] == "x"
            && copy.field[5] == "x"
        ) {

            copy.resultText = "X WIN"
        }

        if (copy.field[6] == "x"
            && copy.field[7] == "x"
            && copy.field[8] == "x"
        ) {

            copy.resultText = "X WIN"
        }

        if (copy.field[0] == "x"
            && copy.field[3] == "x"
            && copy.field[6] == "x"
        ) {

            copy.resultText = "X WIN"
        }

        if (copy.field[1] == "x"
            && copy.field[4] == "x"
            && copy.field[7] == "x"
        ) {

            copy.resultText = "X WIN"

        }

        if (copy.field[2] == "x"
            && copy.field[5] == "x"
            && copy.field[8] == "x"
        ) {

            copy.resultText = "X WIN"
        }

        if (copy.field[0] == "x"
            && copy.field[4] == "x"
            && copy.field[8] == "x"
        ) {

            copy.resultText = "X WIN"
        }

        if (copy.field[2] == "x"
            && copy.field[4] == "x"
            && copy.field[6] == "x"
        ) {

            copy.resultText = "X WIN"
        }

        if (copy.field[0] == "0"
            && copy.field[1] == "0"
            && copy.field[2] == "0"
        ) {

            copy.resultText = "0 WIN"


        }


        if (copy.field[3] == "0"
            && copy.field[4] == "0"
            && copy.field[5] == "0"
        ) {

            copy.resultText = "0 WIN"
        }

        if (copy.field[6] == "0"
            && copy.field[7] == "0"
            && copy.field[8] == "0"
        ) {

            copy.resultText = "0 WIN"
        }

        if (copy.field[0] == "0"
            && copy.field[3] == "0"
            && copy.field[6] == "0"
        ) {

            copy.resultText = "0 WIN"
        }

        if (copy.field[1] == "0"
            && copy.field[4] == "0"
            && copy.field[7] == "0"
        ) {

            copy.resultText = "0 WIN"

        }

        if (copy.field[2] == "0"
            && copy.field[5] == "0"
            && copy.field[8] == "0"
        ) {

            copy.resultText = "0 WIN"
        }

        if (copy.field[0] == "0"
            && copy.field[4] == "0"
            && copy.field[8] == "0"
        ) {

            copy.resultText = "0 WIN"
        }

        if (copy.field[2] == "0"
            && copy.field[4] == "0"
            && copy.field[6] == "0"
        ) {

            copy.resultText = "0 WIN"
        }



        copy.worker = copy.worker + 1
        state.value = copy


    }

    fun notWin() {

        var copy = state.value.copy()

        for (i in 0..8) {

            if (copy.field[i] == "") {

                return

            }
        }

        if (copy.resultText.isEmpty()) {

            copy.resultText = "No winner"
        }



        copy.worker = copy.worker + 1
        state.value = copy


    }

    fun restarter() {

        var copy = state.value.copy()

        copy.resultText = ""
        copy.flag = 0
        copy.field = mutableListOf("", "", "", "", "", "", "", "", "")

        copy.worker = copy.worker + 1
        state.value = copy

    }

}

data class OurStatej(

    var resultText: String = "",
    var flag: Int = 0,
    var worker: Int = 0,
    var field: MutableList<String> = mutableListOf("", "", "", "", "", "", "", "", "")
)