package layout


class ColorPaletteDetail {

    companion object {
        val colorCodes = listOf<String>(
            "Pink 50",
            "100",
            "200",
            "300",
            "400",
            "500",
            "600",
            "700",
            "800",
            "900",
            "A100",
            "A200",
            "A400",
            "A700",
        )

        var colorValue = arrayOf(
            "#FCE4EC",
            "#F8BBD0",
            "#F48FB1",
            "#F06292",
            "#EC407A",
            "#E91E63",
            "#D81B60",
            "#C2185B",
            "#AD1457",
            "#880E4F",
            "#FF80AB",
            "#FF4081",
            "#F50057",
            "#C51162"
        )

        val black = "#FF000000"
        val white = "#FFFFFFFF"

        val textColor = arrayOf(
            black,
            black,
            black,
            black,
            black,
            black,
            white,
            white,
            white,
            white,
            black,
            black,
            black,
            white
        )

        fun getData(): List<Map<String, String>> {
            val list: MutableList<Map<String, String>> = ArrayList()

            val min = minOf(colorCodes.count(), colorValue.count(), textColor.count())
            for (i in 0 until min) {
//            for (i in colorCodes.indices) {
                val palette: MutableMap<String, String> = HashMap()
                palette["colorCode"] = colorCodes[i]
                palette["colorValue"] = colorValue[i]
                palette["textColor"] = textColor[i]
                list.add(palette)
            }

            return list
        }
    }
}