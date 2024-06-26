package com.example.moviesseeries.model

data class Movie(val id: String,
                val title: String,
                val year: String,
                val genre: String,
                val director: String,
                val actors: String,
                val plot: String,
                val images: List<String>,
                val rating: String)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(id = "tt0499549",
            title = "Velozes e Furiosos",
            year = "2001",
            genre = "Ação",
            director = "louis leterrier",
            actors = "Vin Diesel",
            plot = "ao longo de muitas missões e contra probabilidades que pareciam impossíveis, Dom Toretto (Vin Diesel) e sua família foram mais espertos e superaram todos os inimigos em seu caminho. Agora, eles devem desafiar o adversário mais letal que já enfrentaram.",
            images = listOf("https://i.pinimg.com/564x/06/0e/04/060e04aae9d4276a2ab3efff17d2181e.jpg",
                "https://i.pinimg.com/564x/69/0c/ed/690ced64b0c63e90158fd31a14a207a0.jpg",
                "https://i.pinimg.com/564x/49/92/17/4992176ba5de32571ff2b0c6dd22566e.jpg"),
            rating = "9.0"),

        Movie(id = "tt0499548",
            title = "Magick Mike",
            year = "2010",
            genre = "Comedia",
            director = "Steven Soderbergh",
            actors = "Channing Tatum",
            plot = "Depois de causar furor nos isteites chegou a hora do público brasileiro conferir o que Magic Mike tem para mostrar e, meninas e meninos, até que tem um borógódó. Para quem já se empolgou, evidentemente, não vá com muita sede ao pote, né? Mas ele levou classificação R por lá, o que já indica conteúdo restrito e menores de 17 anos somente acompanhados de adultos.",
            images = listOf("https://i.pinimg.com/564x/dc/9a/bb/dc9abb911f052d0f4fe28a80f8b6abd4.jpg",
                "https://i.pinimg.com/564x/bb/0a/b9/bb0ab9ec67691b9d602ae3d11c8cf3dc.jpg",
                "https://i.pinimg.com/564x/63/ab/74/63ab745b9179348eb402d93b2f3a99f9.jpg"),
            rating = "8.0"),

        Movie(id = "tt0499547",
            title = "Gente Grande",
            year = "2015",
            genre = "Comedia",
            director = "Dennis Dugan",
            actors = "Adam Sandler",
            plot = "Em Gente Grande, Lenny (Adam Sandler), Kurt (Chris Rock), Eric (Kevin James), Marcus (David Spade) e Rob (Rob Schneider) se conhecem desde pequenos.",
            images = listOf("https://i.pinimg.com/564x/b1/4b/95/b14b95148f0d1555f0d6c328c23145f5.jpg",
                "https://i.pinimg.com/564x/ef/db/f9/efdbf9132d8b4b77ae6c20e301e62303.jpg",
                "https://i.pinimg.com/564x/19/ee/a3/19eea3a19dbac7c08707c6c544be932b.jpg"),
            rating = "7.0"),

        Movie(id = "tt0499546",
            title = "Cinquenta tons de cinzas",
            year = "2012",
            genre = "Romance",
            director = "James Dornam",
            actors = "Dakota Johnson",
            plot = "Anastasia Steele é uma estudante de literatura de 21 anos, recatada e virgem.",
            images = listOf("https://i.pinimg.com/564x/30/59/b8/3059b8bdf726e1157141592df70adfe2.jpg",
                "https://i.pinimg.com/564x/29/d9/0b/29d90b2ad1e668986c35e3713cfc852f.jpg",
                "https://i.pinimg.com/564x/e7/c9/c7/e7c9c7624e829033840b4e8b9c115225.jpg"),
            rating = "9.0"),

        Movie(id = "tt0499545",
            title = "Avatar",
            year = "2024",
            genre = "Ação",
            director = "Zoe Saldana",
            actors = "Sam Woethington",
            plot = "No exuberante mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser primitivos, mas são altamente evoluídos. Como o ambiente do planeta é tóxico, foram criados os avatares,",
            images = listOf("https://i.pinimg.com/736x/a3/b8/b9/a3b8b9b7e722c62d975b693e2a5e9838.jpg",
                "https://i.pinimg.com/564x/5a/29/0e/5a290e06fb0198b727f4066ce49703f9.jpg",
                "https://i.pinimg.com/564x/32/bf/6a/32bf6abe3e2eac3f16a64a5d1b5a510e.jpg"),
            rating = "7.0"),

        Movie(id = "tt0499544",
            title = "Top Guns",
            year = "2023",
            genre = "Ação",
            director = "Gien Powell",
            actors = "Ton Cruz",
            plot = "A escola naval de pilotos é onde o melhor dos melhores treinam para refinar suas habilidades de voo de elite. Quando o piloto Maverick é enviado para a escola, sua atitude irresponsável e comportamento arrogante o colocam em desacordo com os outros pilotos, especialmente Iceman.",
            images = listOf("https://i.pinimg.com/564x/d6/9f/75/d69f7500f6d86430648f3b89d9a17e8a.jpg",
                "https://i.pinimg.com/564x/d5/e6/7d/d5e67d30adc5c7354f3e964ba331d471.jpg",
                "https://i.pinimg.com/564x/0c/bb/53/0cbb5343ef4a21d10bf66f64df0456b4.jpg"),
            rating = "9.0"),

        Movie(id = "tt0499543",
            title = "Pegando Fogo",
            year = "2005",
            genre = "Culinaria",
            director = "Sienna Miller",
            actors = "Bradley Cooper",
            plot = "Adam Jones já foi um respeitado chef em Paris, mas o abuso de drogas e álcool destruiu sua carreira. Depois de passar um tempo em Nova Orleans, ele tem uma nova oportunidade em Londres, quando é contratado por seu antigo maître para ser o chef de cozinha de um restaurante requintado.",
            images = listOf("https://i.pinimg.com/564x/d5/90/fe/d590fe174da79fca75cd3e81000f867f.jpg",
                "https://i.pinimg.com/564x/dc/a3/df/dca3dfac1ba96a7b54344f4316c7b3a5.jpg",
                "https://br.pinterest.com/pin/407575835041225624/"), rating = "8.0"),

        )

}
