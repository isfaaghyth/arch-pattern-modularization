package app.isfaaghyth.git

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import app.isfaaghyth.git_repositories.feature.GitRepositoriesActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnViewRepo.setOnClickListener {
            //common feature
            startActivity(GitRepositoriesActivity.show(
                this,
                "isfaaghyth"
            ))

            //dynamic features purpose
            //val uri = Uri.parse("appisfaaghyth://belajarmodular/isfaaghyth")
            //val intent = Intent(Intent.ACTION_VIEW, uri)
            //startActivity(intent)
        }
    }
}
