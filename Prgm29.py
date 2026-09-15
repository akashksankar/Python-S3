import numpy as np
import matplotlib.pyplot as plt

# Scores
y1 = [22, 30, 35, 35, 26]
y2 = [25, 32, 30, 35, 29]

# X-axis labels
x_labels = ['G1', 'G2', 'G3', 'G4', 'G5']

# X positions
x1 = np.arange(5)

# Width of each bar
width = 0.40

# Bar chart
plt.bar(x1 - 0.2, y1, color="green", width=width, label='Men')
plt.bar(x1 + 0.2, y2, color="red", width=width, label='Women')

# X-axis
plt.xticks(x1, x_labels)

# Labels
plt.xlabel("Person")
plt.ylabel("Scores")

# Legend
plt.legend()

# Title
plt.title("Scores by group and gender")

# Display
plt.show()
