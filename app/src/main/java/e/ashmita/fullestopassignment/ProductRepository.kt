package e.ashmita.fullestopassignment

import kotlinx.coroutines.delay
import javax.inject.Inject


class ProductRepository @Inject constructor() {

    private val list = ArrayList<Product>()

   // mock data
     suspend fun getData(): ArrayList<Product> {
        delay(2000)
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Bananas_white_background_DS.jpg/320px-Bananas_white_background_DS.jpg", "Banana", "90"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Red_Apple.jpg/265px-Red_Apple.jpg", "Apple", "120"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Table_grapes_on_white.jpg/320px-Table_grapes_on_white.jpg", "Grapes", "180"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Pineapple_and_cross_section.jpg/286px-Pineapple_and_cross_section.jpg", "Pine Apple", "100"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Bananas_white_background_DS.jpg/320px-Bananas_white_background_DS.jpg", "Banana", "90"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Red_Apple.jpg/265px-Red_Apple.jpg", "Apple", "120"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Table_grapes_on_white.jpg/320px-Table_grapes_on_white.jpg", "Grapes", "180"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Pineapple_and_cross_section.jpg/286px-Pineapple_and_cross_section.jpg", "Pine Apple", "100"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Bananas_white_background_DS.jpg/320px-Bananas_white_background_DS.jpg", "Banana", "90"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Red_Apple.jpg/265px-Red_Apple.jpg", "Apple", "120"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Table_grapes_on_white.jpg/320px-Table_grapes_on_white.jpg", "Grapes", "180"))
        list.add(Product("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/Pineapple_and_cross_section.jpg/286px-Pineapple_and_cross_section.jpg", "Pine Apple", "100"))
        return list
    }
}