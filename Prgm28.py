import matplotlib.pyplot as plt
import numpy as np

# Data
languages = ['Java', 'Python', 'PHP', 'JavaScript', 'C#', 'C++']
popularity = [22.2, 17.6, 8.8, 8, 7.7, 6.7]


# (i) Bar Chart of Popularity
plt.figure(figsize=(8, 5))

plt.bar(languages, popularity, color='skyblue')

plt.title('Popularity of Programming Languages')
plt.xlabel('Programming Languages')
plt.ylabel('Popularity (%)')

plt.show()


# (ii) Horizontal Bar Chart of Popularity
plt.figure(figsize=(8, 5))

plt.barh(languages, popularity, color='red')

plt.title('Popularity of Programming Languages (Horizontal)')
plt.xlabel('Popularity (%)')
plt.ylabel('Programming Languages')

plt.show()


# (iii) Bar Chart with Different Colors for Each Bar
colors = ['blue', 'orange', 'green', 'red', 'purple', 'cyan']

plt.figure(figsize=(8, 5))

plt.bar(languages, popularity, color=colors)

plt.title('Popularity of Programming Languages (Different Colors)')
plt.xlabel('Programming Languages')
plt.ylabel('Popularity (%)')

plt.show()


# (iv) Pie Chart of Popularity
plt.figure(figsize=(8, 5))

plt.pie(
    popularity,
    labels=languages,
    autopct='%1.1f%%',
    startangle=140
)

plt.title('Popularity of Programming Languages (Pie Chart)')

plt.axis('equal')

plt.show()
