package com.codigo.codigouitest

import android.graphics.*
import android.view.View

object BitMapUtil {
    fun drawView(v: View): Bitmap {
        val specWidth = View.MeasureSpec.makeMeasureSpec(260 /* any */, View.MeasureSpec.EXACTLY)
        v.measure(specWidth, specWidth)
        val questionWidth: Int = v.getMeasuredWidth()

        val b = Bitmap.createBitmap(questionWidth, questionWidth, Bitmap.Config.ARGB_8888)



        val c = Canvas(b)
        c.drawColor(Color.TRANSPARENT)

        v.layout(v.getLeft(), v.getTop(), v.getRight(), v.getBottom())
        v.draw(c)
        return b
    }

}