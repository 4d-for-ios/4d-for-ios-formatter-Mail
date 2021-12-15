package ___PACKAGE___

import android.content.Intent
import android.net.Uri
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("mailAction")
fun mailAction(view: TextView, mailAction: String?) {
    if (mailAction.isNullOrEmpty()) return

    view.setOnClickListener {
        val mailIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:${mailAction}"))
        view.context.startActivity(Intent.createChooser(mailIntent, "Email"))
    }
}
