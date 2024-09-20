package e.ashmita.fullestopassignment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewmodel @Inject constructor(val repository: ProductRepository):ViewModel() {

    var productLiveData = MutableLiveData<ArrayList<Product>>()

    init {
        getData()
    }



    private fun getData() {
        viewModelScope.launch {
            val data = repository.getData()
            productLiveData.postValue(data)
        }
    }



}