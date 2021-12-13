package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {

        return listOf(
            Affirmation(R.string.affirmation_01, R.drawable.image1),
            Affirmation(R.string.affirmation_02, R.drawable.image2),
            Affirmation(R.string.affirmation_03, R.drawable.image3),
            Affirmation(R.string.affirmation_04, R.drawable.image4),
            Affirmation(R.string.affirmation_05, R.drawable.image5),
            Affirmation(R.string.affirmation_06, R.drawable.image6),
            Affirmation(R.string.affirmation_07, R.drawable.image7),
            Affirmation(R.string.affirmation_08, R.drawable.image8),
            Affirmation(R.string.affirmation_09, R.drawable.image9),
            Affirmation(R.string.affirmation_10, R.drawable.image10)
        )
    }
}