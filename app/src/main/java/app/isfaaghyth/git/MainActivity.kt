package app.isfaaghyth.git

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import isfaaghyth.app.gists.feature.GistActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnViewRepo.setOnClickListener {
            startActivity(GistActivity.open(this, "isfaaghyth"))
            //passing own github username with lastSegment trough applink
//            val uri = Uri.parse("gitjkt://repos/isfaaghyth")
//            val intent = Intent(Intent.ACTION_VIEW, uri)
//            startActivity(intent)
        }
    }
}
