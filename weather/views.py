from django.shortcuts import render
import json
import urllib.request
from django.contrib import messages
# Create your views here.
def index(request):
    city = ''

    if request.method == 'POST':
        if request.POST['city']=="":
            messages.info(request, "Please enter the city in the above textbox provided")
            return render(request, 'weather/index.html')
        else:
            city = request.POST['city'] 
            if len(city.split())!=1:
                city = city.replace(" ", "+")
            res = urllib.request.urlopen("https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=104e518fbcedb219d40211c00db71135").read()
            json_data = json.loads(res)
            city = city.replace("+", " ")
            data = {
                'country_code': str(json_data['sys']['country']),
                'coordinate': str(json_data['coord']['lon'])+ ' '+ str(json_data['coord']['lat']),
                'temp': str(round(json_data['main']['temp']- 273.15))+' c',
                'pressure': str(json_data['main']['pressure']),
                'humidity': str(json_data['main']['humidity']),
                # 'rain': str(json_data['rain']['1h']),
                'city':city,
            }
            return render(request, 'weather/index.html',data)
    else:
        return render(request, 'weather/index.html')
    