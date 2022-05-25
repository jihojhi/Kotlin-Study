package com.example.imbworks.data

import com.example.imbworks.R
import com.example.imbworks.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2,R.drawable.image2),
            Affirmation(R.string.affirmation3,R.drawable.image3),
            Affirmation(R.string.affirmation4,R.drawable.image4),
            Affirmation(R.string.affirmation5,R.drawable.image5),
            Affirmation(R.string.affirmation6,R.drawable.image6)
        )
    }


}