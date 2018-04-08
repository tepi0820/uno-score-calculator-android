package jp.co.tepi.unocalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import jp.co.tepi.unocalculator.db.AppDatabase
import jp.co.tepi.unocalculator.db.model.Player
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        AppDatabase.getInstance(this)?.let {
            for (i: Int in 1..4) {
                val player = Player("Guest " + i)
                it.playerDao().insertAll(player)
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.btnNewPlayer -> {

            }
        }
        return super.onOptionsItemSelected(item)
    }
}
