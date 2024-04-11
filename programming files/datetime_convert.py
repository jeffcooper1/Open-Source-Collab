from datetime import datetime

date_str = "2022-03-17 10:45:30"
# convert date string to datetime object
date_obj = datetime.strptime(date_str, '%m-%d-%Y %H:%M:%M')
# change format
formatted_date = date_obj.strftime('%Y/%d/%m %H:%M:%H')

print(formatted_date)
