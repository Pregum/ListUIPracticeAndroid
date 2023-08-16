package com.example.arrayadapter2

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlin.properties.Delegates

class ColorPaletteAdapter(
    context: Context,
    layoutId: Int,
    colorPaletteData: List<Map<String, String>>
) : BaseAdapter() {

    private var _inflater: LayoutInflater
    private var _layoutId by Delegates.notNull<Int>()
    private var _colorPaletteData: List<Map<String, String>>

    init {
        this._inflater = LayoutInflater.from(context)
        this._layoutId = layoutId
        this._colorPaletteData = colorPaletteData
    }

    override fun getCount(): Int {
        return _colorPaletteData.size
    }

    override fun getItem(position: Int): Any {
        return Any()
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    /**
     * AdapterViewで表示するViewを生成するためのメソッド
     *
     * @param position // 表示するITEMの位置
     * @param convertView   // 以前まで表示していたView
     * @param parent    // getViewで生成されたViewの親となるViewGroup
     * @return view
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // baseAdapterの場合
        // return getViewOnlyBaseAdapter(position, convertView)

        // baseAdapter + ViewHolderの場合
        return getViewWithViewHolder(position, convertView)
    }

    private fun getViewWithViewHolder(position: Int, convertView: View?): View {

        var myViewHolder: MyViewHolder
        var view = convertView
        if (view == null) {
            view = _inflater.inflate(_layoutId, null)

            myViewHolder = this.createViewHolder(view)
            view.tag = myViewHolder
        }

        myViewHolder = view?.tag as MyViewHolder

        val currentPalette = _colorPaletteData[position]
        val currentColorValue = currentPalette["colorValue"]
        val currentColorCode = currentPalette["colorCode"]
        val currentTextColor = currentPalette["textColor"]

        myViewHolder.apply {
            this.colorName.also {
                it.setBackgroundColor(Color.parseColor(currentColorValue))
            }

            this.colorCode.also {
                it.setText(currentColorCode)
                it.setTextColor(Color.parseColor(currentTextColor))
            }

            this.colorValue.also {
                it.setText(currentColorValue)
                it.setTextColor(Color.parseColor(currentTextColor))
            }
        }

        return view
    }

    private fun createViewHolder(view: View): MyViewHolder {
        val colorName = view.findViewById<TextView>(R.id.color)
        val colorCode = view.findViewById<TextView>(R.id.color_code)
        val textColor = view.findViewById<TextView>(R.id.color_value)

        return MyViewHolder(colorName, colorCode, textColor)
    }

    private class MyViewHolder(colorName: TextView, colorCode: TextView, colorValue: TextView) {
        var colorName: TextView
        var colorCode: TextView
        var colorValue: TextView

        init {
            this.colorName = colorName
            this.colorCode = colorCode
            this.colorValue = colorValue
        }
    }

    private fun getViewOnlyBaseAdapter(position: Int, convertView: View?): View {

        /*
            Viewを再利用できるか判定する
            nullであればViewを生成する
            null出なければViewの表示だけ変更して使い回す
         */
        val newView: View = convertView ?: _inflater.inflate(_layoutId, null)

        val colorName = newView.findViewById<TextView>(R.id.color)
        val colorCode = newView.findViewById<TextView>(R.id.color_code)
        val colorValue = newView.findViewById<TextView>(R.id.color_value)

        val targetPalette = _colorPaletteData[position]
        val targetPaletteValue = targetPalette["colorValue"]
        val targetPaletteCode = targetPalette["colorCode"]
        val targetPaletteColor = targetPalette["textColor"]

        colorName.setBackgroundColor(
            Color.parseColor(targetPaletteValue)
        )

        colorCode.apply {
            this.setText(targetPaletteCode)
            this.setTextColor(Color.parseColor(targetPaletteColor))
        }

        colorValue.apply {
            this.setText(targetPaletteValue)
            this.setTextColor(Color.parseColor(targetPaletteColor))
        }

        return newView
    }
}