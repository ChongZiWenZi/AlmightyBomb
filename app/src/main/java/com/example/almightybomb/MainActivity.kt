package com.example.almightybomb


import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_show_dialog.*
import com.example.min_almightybomb.dialog.SweetAlertDialog
import com.example.min_almightybomb.toast.TToast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_dialog)


        //消息等待提示框
        button5.setOnClickListener(View.OnClickListener {
            val dialog = SweetAlertDialog(this)
            dialog.titleText = "请稍候..."
            dialog.show()
            Handler().postDelayed({ dialog.cancel() }, 2000)
        })

        button6.setOnClickListener(View.OnClickListener {
            TToast.showToast(this,"Toast吐司");
        })

        button7.setOnClickListener(View.OnClickListener {
            TToast.showAnimErrorToast(this,"失败")
        })

        button8.setOnClickListener(View.OnClickListener {
            TToast.showAnimSuccessToast(this,"成功")
        })

        button9.setOnClickListener(View.OnClickListener {
            TToast.showAnimToast(this,"文字提示居中")
        })
    }


}
