from datetime import datetime

date_str = "2022-03-17 10:45:30"
# convert date string to datetime object
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S')
# change format
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S')

print(formatted_date)
