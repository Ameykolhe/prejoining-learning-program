import names
import random
import json

data = []

list_of_months = ['jan', 'feb', 'mar', 'apr', 'may', 'jun', 'jul', 'aug', 'sep', 'oct', 'nov', 'dec']
list_of_cities = ['Mumbai', 'Pune', 'Chennai', 'Hyderabad', 'Banglore']

for i in range(20):
    data.append({
        '_id': i + 1,
        'fname': names.get_first_name(),
        'salary': [ { 'month': month, 'amount': random.randrange(20000, 70000, 5000)} for month in list_of_months ],
        'city': random.choice(list_of_cities)
    })

print(json.dumps(data, indent=4))

with open('data.json', 'w') as file:
    json.dump(data, file, indent=4)


from pymongo import MongoClient


client = MongoClient()

db = client.mongotest

collection = db.employee

result = collection.insert_many(data).inserted_ids

print(result)