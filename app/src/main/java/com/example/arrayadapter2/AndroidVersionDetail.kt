package com.example.arrayadapter2

class AndroidVersionDetail {

    companion object {
        fun getData(): List<Map<String, String>> {

            val list = ArrayList<Map<String, String>>()

            val min = minOf(platformVersions.count(), apiLevelList.count(), versionCodes.count())

//            for (i in platformVersions.indices) {
            for (i in 0 until min) {
                val data = HashMap<String, String>()
                data.put("platformVersion", platformVersions[i])
                data.put("apiLevel", apiLevelList[i])
                data.put("versionCode", versionCodes[i])
                list.add(data)
            }

            return list
        }

        private val platformVersions: List<String> = listOf(
            "Android 10.0",
            "Android 9",
            "Android 8.1",
            "Android 8.0",
            "Android 7.1, 7.1.1",
            "Android 7.0",
            "Android 6.0",
            "Android 5.1",
            "Android 5.0",
            "Android 4.4W",
            "Android 4.4",
            "Android 4.3",
            "Android 4.2, 4.2.2",
            "Android 4.1, 4.1.1",
            "Android 4.0.3, 4.0.4",
            "Android 4.0, 4.0.1, 4.0.2",
            "Android 3.2",
            "Android 3.1.x",
            "Android 3.0.x",
            "Android 2.3.3, 2.3.4",
            "Android 2.3, 2.3.1, 2.3.2",
            "Android 2.2.x",
            "Android 2.1.x",
            "Android 2.0.1",
            "Android 2.0",
            "Android 1.6",
            "Android 1.5",
            "Android 1.1",
            "Android 1.0",
        )

        private val apiLevelList: List<String> = listOf(
            "29",
            "28",
            "27",
            "26",
            "25",
            "24",
            "23",
            "22",
            "21",
            "20",
            "19",
            "18",
            "17",
            "16",
            "15",
            "14",
            "13",
            "12",
            "11",
            "10",
            "9",
            "8",
            "7",
            "6",
            "5",
            "4",
            "3",
            "2",
            "1",
        )

        private val versionCodes: List<String> = listOf(
            "Q",
            "P",
            "O_MR1",
            "O",
            "N_MR1",
            "N",
            "M",
            "LOLLIPOP_MR1",
            "LOLLIPOP",
            "KITKAT_WATCH",
            "KITKAT",
            "JELLY_BEAN_MR2",
            "JELLY_BEAN_MR1",
            "JELLY_BEAN",
            "ICE_CREAM_SANDWICH_MR1",
            "ICE_CREAM_SANDWICH",
            "HONEYCOMB_MR2",
            "HONEYCOMB_MR1",
            "HONEYCOMB",
            "GINGERBREAD_MR1",
            "GINGERBREAD",
            "FROYO",
            "ECLAIR_MR1",
            "ECLAIR_0_1",
            "ECLAIR",
            "DONUT",
            "CUPCAKE",
            "BASE_1_1",
            "BASE",
        )
    }
}