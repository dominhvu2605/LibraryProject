import { NavLink } from "react-router-dom";

export const ExploreTopBooks = () => {
  return (
    <div className="p-5 mb-4 bg-dark header">
      <div
        className="container-fluid py-5 text-white d-flex
                justify-content-center align-items-center"
      >
        <div>
          <h1 className="display-5 fw-bold">Find your text adventure</h1>
          <p className="col-md-8 fs-4">Where would you like to go next</p>
          <NavLink
            type="butotn"
            className="btn main-color btn-lg text-white"
            to="/search"
          >
            Explore top books
          </NavLink>
        </div>
      </div>
    </div>
  );
};
