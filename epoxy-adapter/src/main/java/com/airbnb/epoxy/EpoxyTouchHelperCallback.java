package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.List;

/**
 * A wrapper around {@link android.support.v7.widget.helper.ItemTouchHelper.Callback} to cast all
 * view holders to {@link com.airbnb.epoxy.EpoxyViewHolder} for simpler use with Epoxy.
 */
public class EpoxyTouchHelperCallback extends ItemTouchHelper.Callback {

  @Override
  public int getMovementFlags(RecyclerView recyclerView, ViewHolder viewHolder) {
    return getMovementFlags(recyclerView, (EpoxyViewHolder) viewHolder);
  }

  protected int getMovementFlags(RecyclerView recyclerView, EpoxyViewHolder viewHolder) {
    return 0;
  }

  @Override
  public boolean onMove(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder target) {
    return onMove(recyclerView, (EpoxyViewHolder) viewHolder, (EpoxyViewHolder) target);
  }

  protected boolean onMove(RecyclerView recyclerView, EpoxyViewHolder viewHolder,
      EpoxyViewHolder target) {
    return false;
  }

  @Override
  public void onSwiped(ViewHolder viewHolder, int direction) {
    onSwiped((EpoxyViewHolder) viewHolder, direction);
  }

  protected void onSwiped(EpoxyViewHolder viewHolder, int direction) {

  }

  @Override
  public boolean canDropOver(RecyclerView recyclerView, ViewHolder current, ViewHolder target) {
    return canDropOver(recyclerView, (EpoxyViewHolder) current, (EpoxyViewHolder) target);
  }

  protected boolean canDropOver(RecyclerView recyclerView, EpoxyViewHolder current,
      EpoxyViewHolder target) {
    return super.canDropOver(recyclerView, current, target);
  }

  @Override
  public float getSwipeThreshold(ViewHolder viewHolder) {
    return getSwipeThreshold((EpoxyViewHolder) viewHolder);
  }

  protected float getSwipeThreshold(EpoxyViewHolder viewHolder) {
    return super.getSwipeThreshold(viewHolder);
  }

  @Override
  public float getMoveThreshold(ViewHolder viewHolder) {
    return getMoveThreshold((EpoxyViewHolder) viewHolder);
  }

  protected float getMoveThreshold(EpoxyViewHolder viewHolder) {
    return super.getMoveThreshold(viewHolder);
  }

  @Override
  public ViewHolder chooseDropTarget(ViewHolder selected, List dropTargets, int curX,
      int curY) {
    //noinspection unchecked
    return chooseDropTarget((EpoxyViewHolder) selected, (List<EpoxyViewHolder>) dropTargets, curX,
        curY);
  }

  protected EpoxyViewHolder chooseDropTarget(EpoxyViewHolder selected,
      List<EpoxyViewHolder> dropTargets, int curX, int curY) {

    //noinspection unchecked
    return (EpoxyViewHolder) super.chooseDropTarget(selected, (List) dropTargets, curX, curY);
  }

  @Override
  public void onSelectedChanged(ViewHolder viewHolder, int actionState) {
    onSelectedChanged((EpoxyViewHolder) viewHolder, actionState);
  }

  protected void onSelectedChanged(EpoxyViewHolder viewHolder, int actionState) {
    super.onSelectedChanged(viewHolder, actionState);
  }

  @Override
  public void onMoved(RecyclerView recyclerView, ViewHolder viewHolder, int fromPos,
      ViewHolder target, int toPos, int x, int y) {

    onMoved(recyclerView, (EpoxyViewHolder) viewHolder, fromPos, (EpoxyViewHolder) target, toPos, x,
        y);
  }

  protected void onMoved(RecyclerView recyclerView, EpoxyViewHolder viewHolder, int fromPos,
      EpoxyViewHolder target, int toPos, int x, int y) {
    super.onMoved(recyclerView, viewHolder, fromPos, target, toPos, x, y);
  }

  @Override
  public void clearView(RecyclerView recyclerView, ViewHolder viewHolder) {
    clearView(recyclerView, (EpoxyViewHolder) viewHolder);
  }

  protected void clearView(RecyclerView recyclerView, EpoxyViewHolder viewHolder) {
    super.clearView(recyclerView, viewHolder);
  }

  @Override
  public void onChildDraw(Canvas c, RecyclerView recyclerView, ViewHolder viewHolder, float dX,
      float dY, int actionState, boolean isCurrentlyActive) {

    onChildDraw(c, recyclerView, (EpoxyViewHolder) viewHolder, dX, dY, actionState,
        isCurrentlyActive);
  }

  protected void onChildDraw(Canvas c, RecyclerView recyclerView, EpoxyViewHolder viewHolder,
      float dX, float dY, int actionState, boolean isCurrentlyActive) {
    super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
  }

  @Override
  public void onChildDrawOver(Canvas c, RecyclerView recyclerView, ViewHolder viewHolder, float dX,
      float dY, int actionState, boolean isCurrentlyActive) {

    onChildDrawOver(c, recyclerView, (EpoxyViewHolder) viewHolder, dX, dY, actionState,
        isCurrentlyActive);
  }

  protected void onChildDrawOver(Canvas c, RecyclerView recyclerView, EpoxyViewHolder viewHolder,
      float dX, float dY, int actionState, boolean isCurrentlyActive) {

    super.onChildDrawOver(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
  }
}
