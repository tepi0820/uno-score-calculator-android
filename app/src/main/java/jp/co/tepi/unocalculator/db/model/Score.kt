package jp.co.tepi.unocalculator.db.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Score {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var score: Int = 0

    var userName: String = ""
}