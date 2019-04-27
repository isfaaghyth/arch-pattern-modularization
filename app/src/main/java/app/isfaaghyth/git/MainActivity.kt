package app.isfaaghyth.git

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import app.isfaaghyth.git_repositories.feature.GitRepositoriesActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnViewRepo.setOnClickListener {
            startActivity(GitRepositoriesActivity.show(
                this,
                "isfaaghyth"))
        }
    }
}
