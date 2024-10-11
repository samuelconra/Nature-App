package com.samuelconra.natureapp.models

data class Place (val name: String, val description: String, val image: String){
    companion object{
        val places = listOf(
            Place(
                name = "Seljalandsfoss, Iceland",
                description = "One of the most famous waterfalls in Iceland’s south region, Seljalandsfoss is a must-visit stop on any drive along the ring road.",
                image = "https://publish.purewow.net/wp-content/uploads/sites/2/2024/02/most-beautiful-places-in-the-world_Seljalandsfoss-Iceland.jpg?fit=1360%2C800"
            ),
            Place(
                name = "Li River, China",
                description = "Take a river cruise down the Li, which runs 85 kilometers (53 miles) through the region of Guangxi in southern China, for some of the country’s most incredible scenery.",
                image = "https://publish.purewow.net/wp-content/uploads/sites/2/2024/02/most-beautiful-places-in-the-world_li-river-china.jpg?fit=1360%2C800"
            ),
            Place(
                name = "Manarola, Italy",
                description = "One of the quaint fishing villages that make up the colorful Cinque Terre, Manarola is rife with grapevines, lemon groves and medieval walls. You can only imagine the views from here.",
                image = "https://publish.purewow.net/wp-content/uploads/sites/2/2024/02/most-beautiful-places-in-the-world_manarola-italy.jpg?fit=1360%2C800"
            ),
            Place(
                name = "Lake Lugano, Switzerland",
                description = "This picture-perfect glacial lake is the Swiss equivalent of Italy’s Lake Como. Around it, the city of Lugano is a melting pot of Swiss and Mediterranean culture.",
                image = "https://publish.purewow.net/wp-content/uploads/sites/2/2024/02/most-beautiful-places-in-the-world_lake-lugano-switzerland.jpg?fit=1360%2C800"
            ),
            Place(
                name = "Bagan, Myanmar",
                description = "This archeological area encompasses more than 2,000 Buddhist temples, pagodas and monuments that date back to the kingdom of Pagan in the ninth century.",
                image = "https://publish.purewow.net/wp-content/uploads/sites/2/2024/02/most-beautiful-places-in-the-world_bagan-myanmar.jpg?fit=1360%2C800"
            ),
        )
    }
}