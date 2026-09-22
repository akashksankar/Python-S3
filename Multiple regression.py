# Multiple Regression

from sklearn import linear_model
from sklearn.datasets import load_iris
from sklearn.metrics import mean_squared_error, r2_score
from sklearn.model_selection import train_test_split

irisData = load_iris()

X = irisData.data
Y = irisData.target

x_train, x_test, y_train, y_test = train_test_split(
    X, Y, test_size=0.7, random_state=42
)

model = linear_model.LinearRegression()
model.fit(x_train, y_train)

y_pred = model.predict(x_test)
y_pred1 = model.predict(x_train)

print("Mean squared error (0.2 << 0.5) =", mean_squared_error(y_test, y_pred))
print("r2Score (x > 0.7) =", r2_score(y_test, y_pred))
