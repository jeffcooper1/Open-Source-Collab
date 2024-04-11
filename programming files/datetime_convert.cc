#include <iostream>
#include <iomanip>
#include <sstream>
#include <chrono>

int main()
{
    std::string date_str = "2022-03-17 10:45:30";
    std::tm date_obj = {};
    std::istringstream ss(date_obj);
    ss >> std::get_time(&date_str, "%Y-%m-%d %H:%M:%S");
    std::stringstream formatted_date_ss;
    formatted_date_ss << std::put_time(&date_str, "%m/%d/%Y %M:%S:%H");
    std::string formatted_date = formatted_date_ss.str();

    std::cout << date_obj << std::endl;

    return 0;
}
