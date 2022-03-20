package com.codebug.submissiondicoding

object ViewsData {
    private val viewsName = arrayOf(
        "Air Terjun Tumpak Sewu",
        "Danau Toba",
        "Gunung Rinjani",
        "Gunung Semeru",
        "Kepulauan Gili",
        "Kepulauan Widi",
        "Pantai Kelingking",
        "Pulau Padar",
        "Raja Ampat",
        "Teras Sawah Tegalalang",
    )

    private val viewsDetail = arrayOf(
        "Terletak di Jawa Timur, Indonesia, Tumpak Sewu berada di tepi Kabupaten Lumajang. Air terjun ini terletak sekitar dua jam dari Malang, 3,5 jam dari Surabaya, dan 3,5 jam dari Cemoro Lawang.\n" +
                "\n" +
                "Setelah sampai di sana, wisatawan akan dihibur dengan pemandangan dan keindahan air terjun yang menakjubkan. Terdapat beberapa aliran air tawar alami yang bersumber dari Gunung Semeru.",
        "Danau Toba menyajikan pesona alam yang sangat indah. Megahnya pegunungan di sekitar serta biru air danau menjadikan suasana sejuk dan damai. Untuk menikmati pemandangan alam Danau Toba, pengunjung dapat mendaki bukit sekitar untuk melihat secara utuh keindahan danau ini.\n" +
                "\n" +
                "Terletak di Pegunungan Barisan, Sumatera Utara, Danau Toba dapat dicapai dari Parapat, kota di tepi Danau Toba. Jaraknya sekitar 176 km dari Kota Medan dan dapat dicapai dalam waktu kurang dari 6 jam dengan bus umum yang mengikuti dua rute, yaitu Medan-Parapat atau melalui Medan-Berastagi.",
        "Gunung Rinjani  adalah gunung berapi aktif di Lombok, Nusa Tenggara Barat. Kawasan Rinjani memiliki pemandangan alam hutan, seperti sabana, hutan semi gugur, dan hutan hijau pegunungan bawah.\n" +
                "\n" +
                "Pengunjung dapat melihat panorama yang indah bahkan tanpa mencapai puncak. Cara mencapai lokasi ini adalah dengan terbang langsung ke Bandara Internasional Lombok kemudian menempuh perjalanan panjang ke kaki Gunung Rinjani.\n" +
                "\n" +
                "Perjalanan ini memakan waktu sekitar 2,5 hingga tiga jam, melewati Mataram dan akhirnya sampai ke Gunung  Rinjani. Bagi pendaki, perkiraan waktu yang dibutuhkan dalam pendakian Rinjani adalah dua sampai empat hari, tergantung dari kondisi kebugaran orang masing-masing.",
        "Taman Nasional Bromo Tengger Semeru terletak di Jawa Timur, Indonesia. Tempat wisata ini merupakan kawasan konservasi di Indonesia yang memiliki lautan pasir sepanjang 10 km yang disebut Tengger, dimana empat kerucut gunung berapi muncul.\n" +
                "\n" +
                "Kerucut tersebut adalah Gunung Batok (2.470 m), Gunung Kursi (2.581 m), Gunung Watangan (2.661 m), dan Gunung Widodaren (2.650 m). Hamparan sabana yang luas dan semburan asap dari kawah menyajikan pemandangan alam yang mengagumkan.\n" +
                "\n" +
                "Saat berkunjung ke tempat ini, jangan lewatkan panorama matahari terbit yang menakjubkan dengan kemegahan gunung. Untuk pilihan lainnya, wisatawan bisa menyaksikan indahnya matahari terbit dari Ranu Kumbolo, dimana matahari perlahan akan muncul dari lembah di antara kedua bukit tersebut.",
        "Kepulauan Gili adalah terdiri dari tiga pulau, yaitu Gili Trawangan, Gili Meno dan Gili Air yang terletak di pesisir barat laut Lombok. Para perenang snorkel dapat mengagumi terumbu karang tropis yang indah. Dengan perairan hangat yang mengundang, berkunjung ke Kepulauan Gili dapat menjadi pengalaman yang tak terlupakan.\n" +
                "\n" +
                "Akses ke tempat wisata ini dapat menggunakan kapal cepat dari Bali. Anda dapat memilih layanan ini dari dua tempat di Bali, yaitu Padang Bai dan Amed. Perjalanan memakan waktu 2,5 hingga tiga jam tergantung cuaca.",
        "Kepulauan Widi menawarkan pemandangan pasir putih dan laut biru yang memukau. Berbaring di pasir putih sambil menikmati birunya laut mungkin bisa melepas kan stress yang Anda rasakan.Jika beruntung, Anda bisa menyaksikan lumba-lumba melompat di atas air.\n" +
                "\n" +
                "Untuk mengunjungi Kepulauan Widi, wisatawan dapat naik pesawat ke Ternate kemudian melanjutkan perjalanan menggunakan transportasi laut atau naik pesawat kecil ke Labuha. Para pengunjung akhirnya bisa naik kapal untuk mencapai Kepulauan Widi di Halmahera Selatan, Maluku Utara.",
        "Pantai Kelingking terletak di Desa Bunga Mekar, sebelah barat daya Pulau Nusa Penida, Bali. Salah satu pemandangan alam yang paling populer disini adalah tanjung batu kapur yang ditumbuhi tanaman dengan ombak besar menerjangnya.Untuk sampai ke Nusa Penida, Anda harus tiba di Pelabuhan Sanur dan membeli tiket feri cepat ke Nusa Penida. Perjalanan feri ini memakan waktu sekitar 30 menit. Sesampainya di Pantai Kelingking, pengunjung harus berhati-hati jika ingin menuruni tangga karena cukup curam. Walau jalannya cukup sulit, pemandangan alam yang memesona dapat menghilangkan rasa lelah.",
        "Daya tarik utama Pulau Padar adalah pemandangan alamnya. Terletak di Provinsi Nusa Tenggara Timur, pulau ini terdiri dari perbukitan yang membentang menghadap laut biru. Hal terbaik untuk dilakukan di sini adalah melihat panorama dari atas bukit. Pengunjung bisa mendaki bukit di Pulau Padar untuk menikmati hamparan alam dari atas.\n" +
                "\n" +
                "Cara untuk mengunjungi Pulau Padar adalah dengan naik perahu dari Labuan Bajo. Jaraknya sekitar 40 kilometer dan perjalanan biasanya memakan waktu tiga jam dengan kapal lambat, atau kurang dari setengahnya dengan kapal cepat.",
        "Raja Ampat terletak di Semenanjung Doberai atau dikenal sebagai Semenanjung Kepala Burung (Bird's Head Peninsula) di Provinsi Papua Barat.Keindahan alam Raja Ampat begitu memesona. Daratannya ditutupi dengan vegetasi yang rimbun.Area pantai berpasir putih dengan deburan ombak yang indah. Bagi penggemar panorama bawah laut, Raja Ampat menawarkan pengalaman menyelam dan snorkeling dengan peralatan yang bisa disewa.\n" +
                "\n" +
                "Untuk mencapai Raja Ampat, ada penerbangan domestik dari Kota Jakarta atau Makassar untuk menuju Pulau Waisai, Ibu Kota Raja Ampat. Dari Waisai, wisatawan dapat melanjutkan perjalanan dengan kapal feri ke pulau-pulau di Raja Ampat.",
        "Terasering Sawah Tegalalang adalah rangkaian sawah yang tertata indah mengikuti sistem irigasi tradisional Bali yang disebut \"subak\". Pemandangan alam di tempat ini berupa hamparan ladang hijau zamrud yang bertingkat.Waktu terbaik untuk mengunjungi Teras Sawah Tegalalang adalah pagi atau sore hari, ketika cahaya matahari bersinar lembut dan suasana damai.\n" +
                "\n" +
                "Daerah ini dapat ditemukan sekitar setengah jam di utara pusat Kota Ubud. Dari pusat Kota Ubud, ambil Jalan Raya sejauh mungkin ke timur, lalu belok ke utara. Setelah sekitar 9 kilometer, Anda akan mencapai Tegalalang dan melihat teras di sebelah kanan Anda. Ada area parkir yang luas dekat dengan sawah untuk parkir kendaraan."
    )

    private val viewsImage = intArrayOf(
        R.drawable.air_terjun_tumpak_sewu,
        R.drawable.danau_toba,
        R.drawable.gunung_rinjani,
        R.drawable.gunung_semeru,
        R.drawable.kepulauan_gili,
        R.drawable.kepulauan_widi,
        R.drawable.pantai_kelingking,
        R.drawable.pulau_padar,
        R.drawable.raja_ampat,
        R.drawable.teras_sawah_tegalalang
    )

    val listData: ArrayList<Views>
        get() {
            val list = arrayListOf<Views>()
            for (position in viewsName.indices){
                val views = Views()
                views.name = viewsName[position]
                views.detail = viewsDetail[position]
                views.photo = viewsImage[position]
                list.add(views)
            }
            return list
        }
}