package color.wheel.views

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * Created by joel on 3/14/18.
 */
class ArcColorButton:FrameLayout {

    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        if (!isInEditMode)
            init(context, attrs, defStyleAttr)
    }

    fun init(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) {

    }
    }