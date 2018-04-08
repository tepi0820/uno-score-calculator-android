package jp.co.tepi.unocalculator.db.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Game {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var roundNum: Int = 5

    var time: Long = System.currentTimeMillis()
}