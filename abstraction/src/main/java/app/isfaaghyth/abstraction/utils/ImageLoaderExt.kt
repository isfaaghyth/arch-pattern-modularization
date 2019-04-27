package app.isfaaghyth.abstraction.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions

/**
 * Created by isfaaghyth on 27/04/19.
 * github: @isfaaghyth
 */

fun ImageView.load(imageUri: Any) {
    Glide.with(context)
        .load(imageUri)
        .apply(RequestOptions())
        .into(this)
}

fun ImageView.circleLoad(imageUri: Any) {
    Glide.with(context)
        .asBitmap()
        .load(imageUri)
        .apply(RequestOptions()
            .transform(CircleCrop())
        )
        .into(this)
}