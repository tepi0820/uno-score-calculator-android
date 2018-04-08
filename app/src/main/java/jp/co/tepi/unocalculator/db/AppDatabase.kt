package jp.co.tepi.unocalculator.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import jp.co.tepi.unocalculator.db.dao.PlayerDao
import jp.co.tepi.unocalculator.db.model.Game
import jp.co.tepi.unocalculator.db.model.Player
import jp.co.tepi.unocalculator.db.model.Round
import jp.co.tepi.unocalculator.db.model.Score

@Database(entities = [(Game::class), (Round::class), (Score::class), (Player::class)],
        version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun playerDao(): PlayerDao

    companion object {
        private var db: AppDatabase? = null

        @JvmStatic
        fun getInstance(context: Context): AppDatabase? {
            if (db == null) {
                db = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "app.db")
                        .allowMainThreadQueries()
                        .build()
            }
            return db
        }
    }
}